.class public final synthetic Lax/X0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/X0/j$a;


# instance fields
.field public final synthetic a:Lax/X0/e;


# direct methods
.method public synthetic constructor <init>(Lax/X0/e;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/X0/d;->a:Lax/X0/e;

    return-void
.end method


# virtual methods
.method public final a(IJ)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/X0/d;->a:Lax/X0/e;

    invoke-static {v0, p1, p2, p3}, Lax/X0/e;->o(Lax/X0/e;IJ)V

    return-void
.end method
