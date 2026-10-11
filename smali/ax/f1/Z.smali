.class public final synthetic Lax/f1/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic q:Lax/f1/a0$g;


# direct methods
.method public synthetic constructor <init>(Lax/f1/a0$g;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/f1/Z;->q:Lax/f1/a0$g;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/f1/Z;->q:Lax/f1/a0$g;

    invoke-static {v0, p1, p2}, Lax/f1/a0;->a(Lax/f1/a0$g;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
