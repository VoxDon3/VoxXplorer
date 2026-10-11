.class public final synthetic Lax/a1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a1/j$f;


# instance fields
.field public final synthetic a:Lax/a1/f0;


# direct methods
.method public synthetic constructor <init>(Lax/a1/f0;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/c0;->a:Lax/a1/f0;

    return-void
.end method


# virtual methods
.method public final a(Lax/a1/e;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/c0;->a:Lax/a1/f0;

    invoke-virtual {v0, p1}, Lax/a1/f0;->q0(Lax/a1/e;)V

    return-void
.end method
